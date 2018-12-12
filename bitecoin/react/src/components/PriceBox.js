import React from "react";

const PriceBox = props => {
  const { amount, currency } = props;
  return (
    <React.Fragment>
      <h1 className="display-4">
        Current Price:
        <small className="text-muted">{`${amount} ${currency}`}</small>
      </h1>
    </React.Fragment>
  );
};

export default PriceBox;
