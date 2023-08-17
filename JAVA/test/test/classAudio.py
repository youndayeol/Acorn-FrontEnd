'''
Created on 2023. 8. 17.

@author: D
'''
from basic.AudioTVParent import AudioTVParent
class Audio(AudioTVParent):
    def __init__(self, power, volumn):
        super().__init__(power, volumn)
        
    def rune(self):
        str01 = "ha ha ha..." if self.power else "turn it on"
        
        print(str01)