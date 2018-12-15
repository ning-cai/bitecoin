import React from "react";

const PriceChange = props => {
  const { originalAmount, amount, currency } = props;
  const priceChanged = amount - originalAmount !== 0;
  const priceUp = amount - originalAmount > 0;
  const changedAmount = (amount * 100 - originalAmount * 100) / 100;
  const changedPercentage = (
    ((changedAmount * 100) / (originalAmount * 100)) *
    100
  ).toFixed(2);

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
        {`${changedAmount}${currency}   ${changedPercentage}%`}
      </span>
    </React.Fragment>
  );
};

export default PriceChange;
