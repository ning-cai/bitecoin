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
      <h1
        className={
          priceChanged
            ? priceUp
              ? "display-4 badge-success"
              : "display-4 badge-danger"
            : "display-4 badge-light"
        }
      >
        {`${changedAmount} ${currency}    ${changedPercentage}%`}
      </h1>
    </React.Fragment>
  );
};

export default PriceChange;
