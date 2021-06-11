import './App.css';
import Navi from './layouts/Navi';

import 'semantic-ui-css/semantic.min.css'
import Footer from './layouts/Footer';
import SignUpMenu from './pages/SignUpMenu';



function App() {
  return (
    <div className="App">
      <Navi />
      <SignUpMenu/>
      <Footer />
    </div>
  );
}

export default App;
