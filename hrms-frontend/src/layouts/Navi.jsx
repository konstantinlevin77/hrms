import React from 'react'
import { Menu, Button } from 'semantic-ui-react'

export default function Navi() {
    return (
        <div>
            <Menu>
                <Button size={'medium'}>
                    Job Postings
                </Button>
                <Button size={'medium'}>
                    Employers
                </Button>
                <Button primary size={'medium'}>Sign In</Button>
                <Button secondary size={'medium'}>Sign Up</Button>
            </Menu>
        </div>
    )
}
