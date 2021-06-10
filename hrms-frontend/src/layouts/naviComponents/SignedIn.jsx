import React from 'react'
import { Image, Dropdown } from 'semantic-ui-react'

export default function SignedIn() {
    const testImage = 'https://i.teknolojioku.com/storage/files/images/2020/01/26/hallstatt-manzara-1280x720-yvzJ_cover.jpg'
    return (
        <div>
            <p style={{ display: 'inline-block', margin:'20px'}}><b>Mehmet TEKMAN</b></p>
            <Image style={{ display: 'inline-block' }} href={testImage}></Image>
            <Dropdown style={{ display: 'inline-block' }} text={'Your Account'}>
                <Dropdown.Menu>
                    <Dropdown.Item>
                        Account Properties
                </Dropdown.Item>
                <Dropdown.Item>
                        Sign Out
                </Dropdown.Item>
                </Dropdown.Menu>
            </Dropdown>
        </div>
    )
}
