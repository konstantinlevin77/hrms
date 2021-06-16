import React from 'react'

import { Dropdown, Input, Label } from 'semantic-ui-react'
import { Formik, Form, Field, ErrorMessage } from "formik";

export default function JobpostingAddMenu() {
    return (
        <div>
            <div style={{ display: 'flex', margin: '20px', padding: '20px', justifyContent: 'center', border: '1px solid black', width: '600', height: '600', borderRadius: '5px' }}>
                <div style={{ width: "40%", height: "60%", justifyContent: "center", display: 'flex', marginTop: '10px', margin: '40px' }}>
                    <h1>Any place in your app!</h1>
                    <Formik
                        initialValues={{
                            description: "",
                            city: "",
                            position: "",
                            minimum_salary: "",
                            maximum_salary: "",
                            num_open_positions: ""
                        }}

                        onSubmit={(values, { setSubmitting }) => {
                            setTimeout(() => {
                                alert(JSON.stringify(values, null, 2));
                                setSubmitting(false);
                            }, 400);
                        }}
                    >
                        {/* NEED DESIGN */ }
                        {({ isSubmitting }) => (

                            <Form>
                                <Field
                                    as="select"
                                    name="position"
                                >
                                    <option value="bum">bum</option>
                                </Field>

                                <Field as="textarea" name="description" rows="5" cols="80" />

                                <Field
                                    as="select"
                                    name="city"
                                >
                                    <option value="...">...</option>
                                </Field>

                                <Field name="min_salary" />
                                <Field name="max_salary" />
                                <Field name="num_open_positions" />
                                <button type="submit" disabled={isSubmitting}>Add</button>

                            </Form>





                        )}
                    </Formik>
                </div>
            </div>
        </div>
    )
}
