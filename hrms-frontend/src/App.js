import './App.css';
import Navi from './layouts/Navi';

import 'semantic-ui-css/semantic.min.css'
import Footer from './layouts/Footer';
import JobpostingList from './pages/JobpostingList';
import MainMenu from './layouts/MainMenu';

function App() {
  return (
    <div className="App">
      <Navi/>
      <MainMenu/>
      <Footer/>
    </div>
  );
}

export default App;
