import React, { Component } from "react";
import PriceBox from "./components/PriceBox";
import "./App.css";

class App extends Component {
  state = { currentprice: 3000.0, currency: "USD" };
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
