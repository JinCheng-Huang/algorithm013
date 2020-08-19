### 学习笔记
## 递归
# 递归的描述
1. 向下进入不同的递归层；向上又回到原来一层。
2. 通过参数进行不同层之间的传递。
3. 每一层的状态仅与当前层传入的参数相关，不相互影响。
# 代码模版
public void recur(int level,int p1, …) {
// 终止条件
if(level > MAX_LEVEL) {
return;
}
// 处理当前层逻辑
process(level, p1,…);
// 进入下一层
recur(level + 1, newP1, …);
// 清除当前状态
}
# 思维重点
1. 不要人肉进行递归（最大误区）
2. 找到最近最简单方法，将其拆解成可重复解决的问题（重复子问题）
3. 数序归纳法思维
## 分治&回溯
# 分治：
代码模版
private static int divide_conquer(Problem problem, ) {
  
  if (problem == NULL) {
    int res = process_last_result();
    return res;     
  }

  subProblems = split_problem(problem)
  
  res0 = divide_conquer(subProblems[0])
  res1 = divide_conquer(subProblems[1])
  
  result = process_result(res0, res1);
  
  return result;
}

# 回溯：
课程描述：
一种特殊的递归问题，主要的操作就是‘不断的在每一层去尝试’，最终看结果是否满足要求。
