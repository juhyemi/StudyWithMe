 # 📚 오늘의 문제

### 주혜
- 프로그래머스 : [택배상자](https://school.programmers.co.kr/learn/courses/30/lessons/131704)
- 접근법 :
// num = 순서대로 있는 박스의 숫자
        
//            num과 order[i] 비교
//             num == order => count++, num++, i++ => while order[i]와 stack.peek 비교(다를 때 까지, 같으면 pop) 
//             num != order => stack에 num 넣고 num++
            
//             stack.peek>order[i] 면 break;
