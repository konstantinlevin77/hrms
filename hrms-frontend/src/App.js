import './App.css';
import Navi from './layouts/Navi';

import 'semantic-ui-css/semantic.min.css'
import Footer from './layouts/Footer';
import SignUpMenu from './pages/SignUpMenu';
import JobpostingDashboardTable from './layouts/jobpostingDashboardComponents/JobpostingDashboardTable';



function App() {
  return (
    <div className="App">
      <Navi />
      <JobpostingDashboardTable/>
      <Footer />
    </div>
  );
}

export default App;
