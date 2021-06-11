import './App.css';
import Navi from './layouts/Navi';

import 'semantic-ui-css/semantic.min.css'
import Footer from './layouts/Footer';
import SignUpMenu from './pages/SignUpMenu';
import JobpostingDashboard from './layouts/JobpostingDashboard.jsx'



function App() {
  return (
    <div className="App">
      <Navi />
      <JobpostingDashboard/>
      <Footer />
    </div>
  );
}

export default App;
