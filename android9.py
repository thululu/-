from itertools import chain, permutations 
exclusive = {'13': '2', '46': '5', '79': '8', '17': '4', '28': '5', '39': '6', '19': '5', '37': '5', '31': '2', '64': '5', '97': '8', '71': '4', '82': '5', '93': '6', '91': '5', '73': '5'} 
def answer(): 
	iterlst = chain(*(permutations('123456789', i) for i in range(4, 10))) 
	count = 0
	for i in iterlst: 
		stri = ''.join(i)
		for k, v in exclusive.items(): 
			if k in stri and v not in stri[:stri.find(k)]:
				 break 
		else: count += 1 
	return count 
print(answer())
