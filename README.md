# Inventory Management System

A console-based inventory manager written in Java. It lets you add, view, search, update and remove products, and shows low-stock alerts and an inventory summary. Built to practise core Java fundamentals using only arrays, loops, conditionals and `Scanner` input (no external libraries).

## Features

| # | Option | What it does |
|---|--------|--------------|
| 1 | Add a product | Stores ID, name, category, price, quantity and minimum stock level. Rejects duplicate IDs and negative values. |
| 2 | View all products | Prints an aligned table with an OK / LOW status per product. |
| 3 | Search a product | Case-insensitive search by part of the ID, name or category. |
| 4 | Update stock | Add or remove units. Stock can never go below zero, and a warning appears when it drops to the minimum. |
| 5 | Remove a product | Asks for confirmation, then removes the product and closes the gap in the arrays. |
| 6 | Low stock alert | Lists products at or below their minimum level and how many units are missing. |
| 7 | Inventory summary | Product count, total units, total inventory value, average price, most expensive and cheapest product. |
| 8 | Exit | Ends the program. |

Invalid input (for example, typing letters where a number is expected) is handled without crashing.

## Getting Started

### Requirements

- Java Development Kit (JDK) 8 or newer

### Run

```bash
javac InventoryManager.java
java InventoryManager
```

## Example

```text
================================
   Inventory Management System  
================================

============= Menu =============
1. Add A Product
2. View All Products
...
Enter your choice (1-8): 2
========== All Products ==========
ID       Name                 Category          Price    Qty    Min  Status
-----------------------------------------------------------------------
P1       Gaming Mouse         Accessories       25.50      5     10  LOW
P2       Keyboard             Accessories       50.00     20      5  OK
```

## How It Works

- **Parallel arrays:** six arrays (`productIds`, `productNames`, `productCategories`, `productPrices`, `productQuantities`, `minStockLevels`) store the data. Index `i` in every array refers to the same product, and `productCount` tracks how many slots are in use.
- **Main loop:** a `do-while` loop shows the menu until the user chooses Exit, and a `switch` runs the selected option.
- **Searching:** a loop finds a product's index (or `-1` if not found) using `.equals()` for exact matches and `toLowerCase().contains()` for search.
- **Removing:** later products are shifted one slot to the left in all arrays, then the count is reduced.
- **Input validation:** `hasNextInt()` / `hasNextDouble()` reject bad input before it is read.

## Concepts Practised

Variables and constants (`final`), primitive and object types, arithmetic and compound operators, `Scanner` input, `if` / `else`, `switch`, the ternary operator, `while`, `do-while` and `for` loops, `break` and boolean flags, one-dimensional arrays, String methods, and formatted output with `printf`.

## Limitations and Future Improvements

- Data is stored in memory only, so it is lost when the program closes. Saving to and loading from a file is a natural next step.
- Capacity is fixed at 100 products.
- Replacing the parallel arrays with a `Product` class and an `ArrayList` would make the code simpler and easier to extend.
- Sorting products (by name, price or quantity) and unit tests are further ideas.