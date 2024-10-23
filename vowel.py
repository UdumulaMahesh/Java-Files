def count_vowels(input_string):
    vowels="aeiouAEIOU"
    vowel_count=sum(map(input_string.count,vowels))
    return vowel_count
input_string="Hello World"
vowel_count=count_vowels(input_string)
print(f"The Number of vowels in string is :{vowel_count}")