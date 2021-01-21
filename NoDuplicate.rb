str = gets.to_s
arr = str.split(" ")
newarr = arr.uniq
if(arr == newarr)
  print("yes")
else
  print("no") 
end