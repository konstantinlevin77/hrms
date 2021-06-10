import React from 'react'
import {Menu, Button} from 'semantic-ui-react'

export default function SignedOut() {
    return (
        <div>
            <Menu.Item style={{display:'inline-block'}}> 
                <Button primary size={'medium'}>Sign In</Button>
            </Menu.Item>
            <Menu.Item style={{display:'inline-block'}}>
                <Button secondary size={'medium'}>Sign Up</Button>
            </Menu.Item>
        </div>
    )
}
