'''
Created on 2023. 8. 17.

@author: D
'''
class Person:
    def __init__(self, name):
        self.name = name
        
    def say_hello(self):
        print("Hi!", self.name)
        
