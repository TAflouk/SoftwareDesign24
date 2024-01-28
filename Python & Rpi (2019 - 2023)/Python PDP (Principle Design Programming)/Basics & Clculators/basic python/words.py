def get_num(prompt="Enter Number: "):
    """a function that loops until the user enters a valid number
    Args:
        prompt (str): the prompt to be displayed. Defaults to "Enter Number: "
    Returns:
        float: any number in float form, entered by the user
    """
    # use a try/except inside a loop.
    # if the user enters any valid number, convert to float and return
    # otherwise the code will loop again.
    try:
        while (1):
            prompt = float(prompt)
            return prompt
    except:
        return f"enters any valid number"
print(get_num(23))