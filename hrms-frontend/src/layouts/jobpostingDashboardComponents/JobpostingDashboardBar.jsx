import React from 'react'
import { Menu, Dropdown} from 'semantic-ui-react'

export default function JobpostingDashboardBar() {
    return (
        <div style={{paddingLeft:10,paddingRight:10}}>
            <Menu inverted>
                <Menu.Item>
                    <Dropdown><b>City</b></Dropdown>
        </Menu.Item>
                <Menu.Item>
                    <Dropdown><b>Position</b></Dropdown>
                </Menu.Item>

                <Menu.Item>
                <div class="ui input"><input type="text" placeholder="Minimum Salary"/></div>
        </Menu.Item>

                <Menu.Item>

                <div class="ui input"><input type="text" placeholder="Maximum Salart"/></div>
        </Menu.Item>
            </Menu>
        </div>
    )
}
