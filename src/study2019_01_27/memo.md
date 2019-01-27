<div>
  <h2>Recursion (재귀함수) vs Iteration(반복문)</h2>
    <ul>
      <li>모든 순환함수는 반복문(iteration)으로 변경 가능</li>
      <li>그 역도 성립함. 즉 모든 반복문은 recursion으로 표현 가능함</li>
      <li>순환함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현하는 것을 가능하게 함</li>
      <li>하지만 함수 호출에 따른 오버헤드가 있음(매개변수 전달, 액티베이션 프레임생성등)</li>
    </ul>
</div>
<div>
  <h2>순환적 알고리즘 설계</h2>
  <ul>
    <li>적어도 하나의 base case, 즉 순환되지 않고 종료되는 case가 있어야함</li>
    <li>모든 case는 결국 base case로 수렴해야 함</li>
  </ul>
</div>
