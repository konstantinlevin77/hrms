import './App.css';
import Navi from './layouts/Navi';

import 'semantic-ui-css/semantic.min.css'
import Footer from './layouts/Footer';
import SignInMenu from './pages/SignInMenu';



function App() {
  return (
    <div className="App">
      <Navi />
      <SignInMenu/>
      <Footer />
    </div>
  );
}

export default App;
