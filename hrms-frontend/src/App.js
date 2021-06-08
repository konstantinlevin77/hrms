import './App.css';
import Navi from './layouts/Navi';

import 'semantic-ui-css/semantic.min.css'
import Footer from './layouts/Footer';
import JobpostingList from './pages/JobpostingList';

function App() {
  return (
    <div className="App">
      <Navi/>
      <JobpostingList/>
      <Footer/>
    </div>
  );
}

export default App;
