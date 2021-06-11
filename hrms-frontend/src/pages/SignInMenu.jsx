import React from 'react'
import { Form } from 'semantic-ui-react'

export default function SignInMenu() {
    return (
        <div>
            <div style={{ display: 'flex', margin: '20px', padding: '20px', justifyContent: 'center', border: '1px solid black', width: '600', height: '600', borderRadius: '5px' }}>
                <div style={{ width: "40%", height: "60%", justifyContent: "center", display: 'flex', marginTop: '10px', margin: '40px' }}>
                    <Form>
                        <h3>It's nice to see you again!</h3>
                        <Form.Field>
                            <label>Email</label>
                            <input placeholder="Type your email"></input>
                        </Form.Field>
                        <Form.Field>
                            <label>Password</label>
                            <input type="password" placeholder="Type your password"/>
                        </Form.Field>
                        <Form.Button primary>Sign In</Form.Button>
                    </Form>
                </div>
            </div>
        </div>
    )
}
