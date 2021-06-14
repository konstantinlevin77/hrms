import React from 'react'
import { NavLink } from 'react-router-dom'
import {Menu, Button} from 'semantic-ui-react'

export default function SignedOut() {
    return (
        <div>
            <Menu.Item style={{display:'inline-block'}}> 
                <Button as={NavLink} to="/signIn" primary size={'medium'}>Sign In</Button>
            </Menu.Item>
            <Menu.Item style={{display:'inline-block'}}>
                <Button as={NavLink} to="/signUp" secondary size={'medium'}>Sign Up</Button>
            </Menu.Item>
        </div>
    )
}
