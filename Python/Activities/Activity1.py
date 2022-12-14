a = """This is activity"""

name = input("Enter your Name: ")
age = input("Enter your age: ")
year = str(2022 + (100-37))
print("Hi " +name+", You will be 100 years old in " +year+".")
text = "Hi {0}, You will be 100 years old in {1}."
print(text.format(name,year))