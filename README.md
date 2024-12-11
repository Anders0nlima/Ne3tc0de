# ✅ VALID-ANAGRAMA

## 💡 **How does this work?**
```java
char[] sSort = s.toCharArray(); 
char[] tSort = t.toCharArray(); 
Arrays.sort(sSort); 
Arrays.sort(tSort); 
return Arrays.equals(sSort, tSort);
```

🧪 Example using the strings "dog" and "god"
1️⃣ Conversion to character array:
s = "dog" → sSort = ['d', 'o', 'g']
t = "god" → tSort = ['g', 'o', 'd']
2️⃣ Array ordering:
sSort = ['d', 'o', 'g'] → order → ['d', 'g', 'o']
tSort = ['g', 'o', 'd'] → order → ['d', 'g', 'o']
3️⃣ Comparison of arrays:
sSort = ['d', 'g', 'o']
tSort = ['d', 'g', 'o']
