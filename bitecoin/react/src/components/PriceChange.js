import React from "react";

const PriceChange = props => {
  const { originalAmount, amount, currency } = props;
  const priceChanged = amount - originalAmount !== 0;
  const priceUp = amount - originalAmount > 0;

  return (
    <React.Fragment>
      <span
        className={
          priceChanged
            ? priceUp
              ? "badge badge-success"
              : "badge badge-danger"
            : "badge badge-light"
        }
      >
        {`${amount - originalAmount} ${currency}   ${((amount -
          originalAmount) /
          originalAmount) *
          100}%`}
      </span>
    </React.Fragment>
  );
};

export default PriceChange;
