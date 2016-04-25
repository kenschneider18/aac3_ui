import numpy as np
from scipy.io import wavfile
from scipy.fftpack import fft, ifft
from scipy import signal
import wave, struct
import sys

import time

def show_info(aname, a):
    print "Array", aname
    print "shape:", a.shape
    print "dtype:", a.dtype
    print "min, max:", a.min(), a.max()
    print

# playing with the sound to sound angry= change freqency
for arg in sys.argv:
	print arg
wavname = sys.argv[1]
emotion = sys.argv[2]

print wavname
print emotion

if emotion == 'a':
	rate, data = wavfile.read(wavname)

	wavfile.write(wavname, rate*0.8, data)

	print("Conversion Finished.")

if emotion == 'j':
	# Trying to change volume to add loving tone
	rate, data = wavfile.read(wavname)

	wavfile.write(wavname, rate*1.5, data)

	print("Conversion Finished.")
