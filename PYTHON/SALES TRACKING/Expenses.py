import csv
from datetime import datetime

# File to save expenses
FILENAME = "expenses.csv"

# Create file with headers if not exists
def init_file():
    try:
        with open(FILENAME, 'x', newline='') as file:
            writer = csv.writer(file)
            writer.writerow(["Date", "Item", "Amount"])
    except FileExistsError:
        pass  # File already exists

# Add new expense
def add_expense():
    item = input("Enter item name: ")
    amount = input("Enter amount (e.g. 10.50): ")
    date = datetime.now().strftime("%Y-%m-%d %H:%M")
    
    with open(FILENAME, 'a', newline='') as file:
        writer = csv.writer(file)
        writer.writerow([date, item, amount])
    
    print("✅ Expense added!\n")

# View all expenses
def view_expenses():
    try:
        with open(FILENAME, 'r') as file:
            reader = csv.reader(file)
            for row in reader:
                print(" | ".join(row))
    except FileNotFoundError:
        print("❌ No expenses found.")

# Show total expenses
def total_expenses():
    total = 0
    try:
        with open(FILENAME, 'r') as file:
            reader = csv.reader(file)
            next(reader)  # skip header
            for row in reader:
                total += float(row[2])
        print(f"\n💰 Total spent: {total:.2f}")
    except FileNotFoundError:
        print("❌ No expenses found.")

# Main menu
def menu():
    while True:
        print("\n--- Daily Expense Tracker ---")
        print("1. Add Expense")
        print("2. View Expenses")
        print("3. Total Spent")
        print("4. Exit")

        choice = input("Choose an option: ")
        
        if choice == '1':
            add_expense()
        elif choice == '2':
            view_expenses()
        elif choice == '3':
            total_expenses()
        elif choice == '4':
            break
        else:
            print("❌ Invalid option. Try again.")

# Run the app
init_file()
menu()
