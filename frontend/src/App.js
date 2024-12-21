import logo from './logo.svg';
import './App.css';
import React, {useState, useEffect} from 'react';

function App() {
  // message 초기값 설정 (""로 설정)
  const [data, setData] = useState('');
//    const [message, setMessage] = useState("");

  // useEffect(함수, 배열) : 컴포넌트가 화면에 나타났을 때 자동 실행
  useEffect(() => {
      // 프론트엔드에서 백엔드로 API 요청 보내기
      fetch('http://localhost:8080/api/data') // proxy 설정으로 localhost:8080/api/data로 자동 전달
        .then((response) => response.text())
        .then((text) => setData(text))
        .catch((error) => console.error('Error fetching data:', error));
    }, []);

     return (
        <div>
          <h1>React + Spring Boot Integration</h1>
          <p>Response from Backend: {data || 'Loading...'}</p>
        </div>
      );
//  return (
//    <div className="App">
//      <header className="App-header">
//        <img src={logo} className="App-logo" alt="logo" />
//        <p>
//          Edit <code>src/App.js</code> and save to reload.
//        </p>
//        <a
//          className="App-link"
//          href="https://reactjs.org"
//          target="_blank"
//          rel="noopener noreferrer"
//        >
//          Learn React
//        </a>
//      </header>
//    </div>
//  );
}

export default App;
