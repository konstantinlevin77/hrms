import React from 'react'
import { Menu, Button } from 'semantic-ui-react'

export default function Navi() {
    return (
        <div>
            <Menu >
                <Menu.Item>
                    <b>Human Resources MS</b>
                </Menu.Item>
                <Menu.Item>
                    <Button size={'medium'}>
                        Job Postings
                </Button>
                </Menu.Item>
                <Menu.Item>
                    <Button size={'medium'}>
                        Employers
                </Button>
                </Menu.Item>
                <Menu.Item>
                    <Button primary size={'medium'}>Sign In</Button>
                </Menu.Item>
                <Menu.Item>
                    <Button secondary size={'medium'}>Sign Up</Button>
                </Menu.Item>

            </Menu>
        </div>
    )
}
