import './App.css';
import Navi from './layouts/Navi';

import 'semantic-ui-css/semantic.min.css'
import Footer from './layouts/Footer';
import { Route } from 'react-router';

import MainMenu from './pages/MainMenu';
import JobpostingList from './pages/JobpostingList'
import SignUpMenu from './pages/SignUpMenu'
import SignInMenu from './pages/SignInMenu'
import JobpostingAddMenu from './pages/JobpostingAddMenu'
import JobpostingDetailPage from './pages/JobpostingDetailPage';



function App() {
  return (
    <div className="App">
      <Navi />
      <Route exact path="/" component={MainMenu}/>
      <Route exact path="/jobpostings" component={JobpostingList}/>
      <Route exact path="/signIn" component={SignInMenu}/>
      <Route exact path="/signUp" component={SignUpMenu}/>
      <Route exact path="/jobpostings/add" component={JobpostingAddMenu}/>
      <Route exact path="/jobpostings/:id" component={JobpostingDetailPage}/>
    </div>
  );
}

export default App;
