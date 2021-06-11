import React from 'react'
import { Menu, Form } from 'semantic-ui-react'

export default function SignUpMenu() {
    return (
        <div style={{
            display: "flex", justifyContent: "center",
            margin: "20px", padding: "20px", border: "1 px solid black", borderRadius: "3px",
            width: "600", height: "600"
        }}>
            <div style={{ width: "40%", height: "60%", justifyContent: "center", display: 'flex', marginTop: '10px', margin: '40px' }}>
                <Form>
                    <h3>Choose your membership type!</h3>
                    <Menu style={{fontSize:19}}>
                        <Menu.Item>
                            Employer
                        </Menu.Item>
                        <Menu.Item>
                            Jobseeker
                        </Menu.Item>
                    </Menu>
                    {/* Now there will be the form according to the choice of user.*/}
                </Form>
            </div>
        </div>
    )
}
