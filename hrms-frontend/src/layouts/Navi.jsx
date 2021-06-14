import React from 'react'
import { Menu, Button } from 'semantic-ui-react'
import SignedOut from './naviComponents/SignedOut'


export default function Navi() {
    return (
        <div style={{ marginBottom: 20 }}>
            <Menu>
                <Menu.Item>
                    <b>Human Resources MS</b>
                </Menu.Item>
                <Menu.Menu position="right">
                    <Menu.Item>
                        <Button size={'medium'}>
                            Job Postings
                </Button>
                    </Menu.Item>
                    <SignedOut />
                </Menu.Menu>
            </Menu>
        </div>
    )
}
