import React from "react";

const PriceBox = props => {
  const { price, currency } = props;
  return (
    <React.Fragment>
      <h1 class="display-4">
        Current Price:{" "}
        <small class="text-muted">{`${price} ${currency}`}</small>
      </h1>
    </React.Fragment>
  );
};

export default PriceBox;
