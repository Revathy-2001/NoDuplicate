

st = input()
lst = st.split(" ")
newlst =  list(dict.fromkeys(lst))
if(lst == newlst):
  print("yes")
else:
  print("no") 