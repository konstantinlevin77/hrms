import './App.css';
import Navi from './layouts/Navi';

import 'semantic-ui-css/semantic.min.css'
import Footer from './layouts/Footer';
import JobpostingList from './pages/JobpostingList';
import JobpostingAddMenu from './pages/JobpostingAddMenu';


function App() {
  return (
    <div className="App">
      <Navi/>
      <JobpostingAddMenu/>
      <Footer/>
    </div>
  );
}

export default App;
