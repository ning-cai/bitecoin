import React, { Component } from "react";
import PriceBox from "./components/PriceBox";
import PriceChange from "./components/PriceChange";
import "./App.css";

class App extends Component {
  originalAmount = 0;
  state = { isLoaded: false, amount: 3000.0, currency: "USD" };

  componentDidMount = () => {
    this.getOriginalPrice();
    this.timer = setInterval(this.updatePrice, 10000);
  };

  componentWillUnmount = () => {
    clearInterval(this.timer);
  };

  getOriginalPrice = () =>
    fetch("http://localhost:8080/price")
      .then(response => response.json())
      .then(
        result => {
          console.log("getOriginalPrice:", result);
          this.originalAmount = parseFloat(result.amount);
          this.setState({
            isLoaded: true,
            amount: this.originalAmount,
            currency: result.currency
          });
        },
        error => {
          console.log("getOriginalPrice error");
        }
      );

  updatePrice = () =>
    fetch("http://localhost:8080/price")
      .then(response => response.json())
      .then(
        result => {
          console.log("response:", result);
          this.setState({
            isLoaded: true,
            amount: parseFloat(result.amount),
            currency: result.currency
          });
        },
        error => {
          this.setState({ isloaded: true, error });
        }
      );

  render() {
    const { amount, currency } = this.state;
    return (
      <React.Fragment>
        <PriceBox amount={amount} currency={currency} />
        <PriceChange
          originalAmount={this.originalAmount}
          amount={amount}
          currency={currency}
        />
      </React.Fragment>
    );
  }
}

export default App;
