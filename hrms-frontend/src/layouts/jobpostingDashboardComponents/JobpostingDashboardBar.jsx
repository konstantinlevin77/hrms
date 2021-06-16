import React, {useState} from 'react'
import { Menu, Dropdown} from 'semantic-ui-react'
import JobPostingDashboardBarAddButton from './JobPostingDashboardBarAddButton'

export default function JobpostingDashboardBar() {

    const [isEmployer, setIsEmployer] = useState(true)

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

                <div class="ui input"><input type="text" placeholder="Maximum Salary"/></div>
        </Menu.Item>
        {isEmployer ? <JobPostingDashboardBarAddButton/> : null}
            </Menu>
        </div>
    )
}
