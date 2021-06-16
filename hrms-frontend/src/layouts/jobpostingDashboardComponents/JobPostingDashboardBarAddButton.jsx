import React from 'react'
import { Menu, Button } from 'semantic-ui-react'
import { NavLink } from "react-router-dom";

export default function JobPostingDashboardBarAddButton() {
    return (
        <div>
            <Menu.Item>
                <Button primary as={NavLink} to="/jobpostings/add">
                    Add
                    </Button>
            </Menu.Item>
        </div>
    )
}
