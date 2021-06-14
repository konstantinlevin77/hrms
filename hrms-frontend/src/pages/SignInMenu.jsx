import React from 'react'
import { Formik, Form, Field, ErrorMessage } from 'formik';
import styles from '../styles/SignInMenuFormStyles.module.css'

export default function SignInMenu() {
    return (
        <div>
            <div style={{ display: 'flex', margin: '20px', padding: '20px', justifyContent: 'center', border: '1px solid black', width: '600', height: '600', borderRadius: '5px' }}>
                <div style={{ width: "40%", height: "60%", justifyContent: "center", display: 'flex', marginTop: '10px', margin: '40px' }}>
                    {/* For now, I've disabled validations but I'll get them later.*/}
                    <Formik
                        initialValues={{ email: '', password: '' }}

                        onSubmit={(values, { setSubmitting }) => {
                            setTimeout(() => {
                                alert(JSON.stringify(values, null, 2));
                                setSubmitting(false);
                            }, 400);
                        }}
                    >
                        {({ isSubmitting }) => (
                            <Form>
                                <label>Email</label>
                                <Field type="email" name="email" className={styles.field}/>
                                <ErrorMessage name="email" component="div" />
                                <label>Pasword</label>
                                <Field type="password" name="password" className={styles.field}/>
                                <ErrorMessage name="password" component="div" />
                                <button type="submit" className={styles.button} disabled={isSubmitting}>
                                    Submit
                                </button>
                            </Form>
                        )}
                    </Formik>
                </div>
            </div>
        </div>
    )
}
