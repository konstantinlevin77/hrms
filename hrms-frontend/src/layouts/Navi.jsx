import React from 'react'
import { Menu, Button } from 'semantic-ui-react'
import SignedIn from './naviComponents/SignedIn'


export default function Navi() {
    return (
        <div style={{ marginBottom: 20 }}>
            <Menu>
                <Menu.Item>
                    <b>Human Resources MS</b>
                </Menu.Item>
                <Menu.Item>
                    <Button size={'medium'}>
                        Job Postings
                </Button>
                </Menu.Item>
                <SignedIn />
            </Menu>
        </div>
    )
}
