'''
Created on 2023. 8. 17.

@author: D
'''
class AudioTVParent:
    def __init__(self, power, volumn):
        self.power = power
        self.volumn = volumn
        
    def switch(self, onOff):
        self.power = onOff
        
    def self_volumn(self, vol):
        self. volumn = vol