# Trading

Ecore model for (algorithmic) trading. Focus on expainability

* Broker - executes orders received from traders, canExecute(Order) - may support only certain types of orders. May size orders and paper execute them. May also modify them to adjust risk etc. E.g. add or remove a stop order. Contains portfolios
* Orders - "classic", composite (flows). Probability distributions - gain (can be negative), probability
* Symbol
* Exchange
* Portfolio - symbols and amounts, traders
* Trader - subscribes for symbol feeds and submits orders. Consider using Java react for subscription and order collection
* Ledger - orders. Git/GitLab ledger - storage in a file system.
* Transaction (in computer terms). Use XA?
* TraderBroker - chaining of brokers - a broker which connects to another broker. E.g. a broker which can execute complex orders by delegating to another broker which can execute only simple (classic) orders.
* Range - extends Period, opening, closing, min, max, volume, delta (derived)


Algorithmic traders:

* Smile regression and possibly other techniques
* AI



