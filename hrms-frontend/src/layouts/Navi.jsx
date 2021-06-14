import React from 'react'
import { NavLink } from 'react-router-dom'
import { Menu, Button } from 'semantic-ui-react'
import SignedOut from './naviComponents/SignedOut'


export default function Navi() {
    return (
        <div style={{ marginBottom: 20 }}>
            <Menu>
                <Menu.Item as={NavLink} to="/">
                    <b>Human Resources MS</b>
                </Menu.Item>
                <Menu.Menu position="right">
                    <Menu.Item as={NavLink} to="/jobpostings">
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
