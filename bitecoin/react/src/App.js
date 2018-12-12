import React, { Component } from "react";
import PriceBox from "./components/PriceBox";
import "./App.css";

class App extends Component {
  state = { isLoaded: false, amount: 3000.0, currency: "USD" };

  componentDidMount() {
    fetch("http://localhost:8080/price")
      .then(response => response.json())
      .then(
        result => {
          console.log("response:", result);
          this.setState({
            isLoaded: true,
            amount: result.amount,
            currency: result.currency
          });
        },
        error => {
          this.setState({ isloaded: true, error });
        }
      );
  }

  render() {
    const { amount, currency } = this.state;
    return (
      <React.Fragment>
        <PriceBox amount={amount} currency={currency} />
      </React.Fragment>
    );
  }
}

export default App;
