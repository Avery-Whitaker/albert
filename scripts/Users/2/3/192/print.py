print("10 5")
S = raw_input()

f = open('derp','w')
f.write(S) # python will convert \n to os.linesep
f.close() # you can omit in most cases as the destructor will call if
