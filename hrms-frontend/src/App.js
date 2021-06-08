import './App.css';
import Navi from './layouts/Navi';

import 'semantic-ui-css/semantic.min.css'
import Dashboard from './layouts/JobpostingDashboard';
import Footer from './layouts/Footer';

function App() {
  return (
    <div className="App">
      <Navi/>
      <Dashboard/>
      <Footer/>
    </div>
  );
}

export default App;
