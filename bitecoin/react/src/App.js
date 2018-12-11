import React, { Component } from "react";
import PriceBox from "./components/PriceBox";
import "./App.css";

class App extends Component {
  state = { currentprice: 3000.0, currency: "USD" };

  componentDidMount() {
    fetch("http://localhost:8080/price")
      .then(response => response.json())
      .then(
        result => {
          console.log("response:", result);
          this.setState({
            isloaded: true,
            currentprice: result.currentprice,
            currency: result.currency
          });
        },
        error => {
          this.setState({ isloaded: true, error });
        }
      );
  }

  render() {
    const { currentprice, currency } = this.state;
    return (
      <React.Fragment>
        <PriceBox price={currentprice} currency={currency} />
      </React.Fragment>
    );
  }
}

export default App;
