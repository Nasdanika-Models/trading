An Ecore metamodel for Interactive Brokers (IBKR) trading concepts, designed for automated trader agents to create trading proposals that can be executed on real or paper accounts.

```drawio-resource
trading.drawio
```

## Overview

This model captures the core trading concepts from IBKR's [TWS API](https://ibkrcampus.com/campus/ibkr-api-page/twsapi-doc/) and [Web API](https://www.interactivebrokers.com/campus/ibkr-api-page/webapi-ref/), enabling:

- **Trader agents** to generate structured trading proposals
- **Human review** of AI-generated trading decisions before execution
- **Execution** on live or paper trading accounts
- **Risk management** through configurable parameters

## Model Structure

### Core Classes

| Class | Description |
|-------|-------------|
| `Contract` | Tradeable financial instrument (stocks, options, futures, forex, etc.) |
| `Order` | Order to buy/sell with type, quantity, price, and timing parameters |
| `TradingProposal` | Agent-generated proposal containing orders for review/execution |
| `TradingAccount` | IBKR account (live or paper) for order execution |
| `BracketOrder` | Entry order with attached profit taker and stop loss |
| `Position` | Current holding in a portfolio |
| `ExecutionResult` | Result of order execution with fill details |
| `MarketDataSnapshot` | Point-in-time market data for a contract |

### Enumerations

| Enum | Values |
|------|--------|
| `SecurityType` | STK, OPT, FUT, FOP, CFD, CASH, BOND, WAR, FUND, CRYPTO, IND, CMDTY, BAG, IOPT |
| `OrderType` | MKT, LMT, STP, STP_LMT, MIT, LIT, TRAIL, TRAIL_LIMIT, REL, MOC, LOC, MIDPRICE, ADAPTIVE, VWAP, TWAP |
| `OrderAction` | BUY, SELL |
| `TimeInForce` | DAY, GTC, IOC, GTD, OPG, FOK, DTC |
| `OrderStatus` | PendingSubmit, PendingCancel, PreSubmitted, Submitted, ApiCancelled, Cancelled, Filled, Inactive |
| `ProposalStatus` | DRAFT, PENDING_REVIEW, APPROVED, REJECTED, EXECUTING, EXECUTED, PARTIALLY_EXECUTED, FAILED, EXPIRED |
| `AccountType` | LIVE, PAPER |
| `TriggerMethod` | DEFAULT, DOUBLE_BID_ASK, LAST, DOUBLE_LAST, BID_ASK, LAST_OR_BID_ASK, MIDPOINT |

## Usage Examples

### Creating a Simple Stock Order Proposal

```java
// Create a contract for AAPL stock
Contract contract = IbkrFactory.eINSTANCE.createContract();
contract.setSymbol("AAPL");
contract.setSecType(SecurityType.STK);
contract.setExchange("SMART");
contract.setCurrency("USD");

// Create a limit buy order
Order order = IbkrFactory.eINSTANCE.createOrder();
order.setAction(OrderAction.BUY);
order.setOrderType(OrderType.LMT);
order.setTotalQuantity(new BigDecimal("100"));
order.setLmtPrice(175.50);
order.setTif(TimeInForce.DAY);
order.setContract(contract);

// Wrap in a trading proposal
TradingProposal proposal = IbkrFactory.eINSTANCE.createTradingProposal();
proposal.setId(UUID.randomUUID().toString());
proposal.setName("Buy AAPL on weakness");
proposal.setAgentId("momentum-agent-1");
proposal.setConfidence(0.85);
proposal.setStatus(ProposalStatus.PENDING_REVIEW);
proposal.getOrders().add(order);
```

### Creating a Bracket Order

```java
// Entry order
Order entry = IbkrFactory.eINSTANCE.createOrder();
entry.setAction(OrderAction.BUY);
entry.setOrderType(OrderType.LMT);
entry.setTotalQuantity(new BigDecimal("50"));
entry.setLmtPrice(150.00);

// Profit taker
Order profitTaker = IbkrFactory.eINSTANCE.createOrder();
profitTaker.setAction(OrderAction.SELL);
profitTaker.setOrderType(OrderType.LMT);
profitTaker.setTotalQuantity(new BigDecimal("50"));
profitTaker.setLmtPrice(165.00);

// Stop loss
Order stopLoss = IbkrFactory.eINSTANCE.createOrder();
stopLoss.setAction(OrderAction.SELL);
stopLoss.setOrderType(OrderType.STP);
stopLoss.setTotalQuantity(new BigDecimal("50"));
stopLoss.setAuxPrice(145.00);

// Create bracket
BracketOrder bracket = IbkrFactory.eINSTANCE.createBracketOrder();
bracket.setEntryOrder(entry);
bracket.setProfitTaker(profitTaker);
bracket.setStopLoss(stopLoss);
```

### Options Contract

```java
Contract option = IbkrFactory.eINSTANCE.createContract();
option.setSymbol("AAPL");
option.setSecType(SecurityType.OPT);
option.setExchange("SMART");
option.setCurrency("USD");
option.setLastTradeDateOrContractMonth("20260320"); // March 2026 expiry
option.setStrike(180.0);
option.setRight(OptionRight.CALL);
option.setMultiplier("100");
```

## Workflow

1. **Agent generates proposal** - Trader agent analyzes market and creates `TradingProposal` with orders
2. **Review** - Human or automated system reviews proposal (status: `PENDING_REVIEW`)
3. **Approval** - Proposal approved (status: `APPROVED`) or rejected
4. **Execution** - Orders submitted to IBKR (status: `EXECUTING`)
5. **Results** - `ExecutionResult` captures fills, prices, commission
6. **Completion** - Status updated to `EXECUTED`, `PARTIALLY_EXECUTED`, or `FAILED`

## Risk Management

The `RiskParameters` class allows setting:

- Maximum position size (% of portfolio)
- Stop loss percentage
- Take profit percentage  
- Maximum drawdown
- Trailing stop percentage

## IBKR API References

- [TWS API Documentation](https://ibkrcampus.com/campus/ibkr-api-page/twsapi-doc/)
- [Web API Reference](https://www.interactivebrokers.com/campus/ibkr-api-page/webapi-ref/)
- [Order Types](https://www.interactivebrokers.com/campus/ibkr-api-page/order-types/)
- [Contracts](https://www.interactivebrokers.com/campus/ibkr-api-page/contracts/)

## Files

- `model/ibkr.ecore` - EMF Ecore metamodel

## License

See LICENSE file for details.