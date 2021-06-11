import React from 'react'
import { Form, Dropdown } from 'semantic-ui-react'

export default function JobpostingAddMenu() {
    return (
        <div>
            <div style={{ display: 'flex', margin: '20px', padding: '20px', justifyContent: 'center', border: '1px solid black', width: '600', height: '600', borderRadius: '5px' }}>
                <div style={{ width: "40%", height: "60%", justifyContent: "center", display: 'flex', marginTop:'10px',margin:'40px' }}>
                    <Form>
                        <h3>You are about to find your dream staff, just one more step.</h3>
                        <Form.Field>
                            <label>Description</label>
                            <textarea rows={5} cols={80}></textarea>
                        </Form.Field>

                        <Form.Field>
                            <label>Position</label>
                            <Dropdown text={'Choose Position'}>

                            </Dropdown>
                        </Form.Field>
                        <Form.Field>
                            <label>City</label>
                            <input placeholder="City"></input>
                        </Form.Field>
                        <Form.Field>
                            <label>Minimum Salary</label>
                            <input placeholder="Minimum Salary"></input>
                        </Form.Field>
                        <Form.Field>
                            <label>Maximum Salary</label>
                            <input placeholder="Maximum Salary"></input>
                        </Form.Field>
                        <Form.Field>
                            <label>Number of Open Positions</label>
                            <input placeholder="Number of Open Positions"></input>
                        </Form.Field>
                        <Form.Button>
                            Submit
                        </Form.Button>
                    </Form>
                </div>
            </div>
        </div>
    )
}
