import React, { useState, useEffect } from 'react'
import { Table } from 'semantic-ui-react'
import JobPostingService from '../../services/JobPostingService';

export default function JobpostingDashboardTable() {

    const [jobpostings, setJobpostings] = useState([]);

    useEffect(() => {
        let jobPostingService = new JobPostingService()
        jobPostingService.getActiveAll().then(result => setJobpostings(result.data.data))
    })


    return (

        <div>
            <Table celled>
                <Table.Header>
                    <Table.Row>
                        <Table.HeaderCell>Description</Table.HeaderCell>
                        <Table.HeaderCell>Position</Table.HeaderCell>
                        <Table.HeaderCell>City</Table.HeaderCell>
                        <Table.HeaderCell>Minimum Salary</Table.HeaderCell>
                        <Table.HeaderCell>Maximum Salary</Table.HeaderCell>
                        <Table.HeaderCell>Number of Open Positions</Table.HeaderCell>
                    </Table.Row>
                </Table.Header>
                <Table.Body>
                    {
                        jobpostings.map((jobposting) => (
                            <Table.Row key={jobposting.id}>
                                <Table.Cell>jobposting.description</Table.Cell>
                                <Table.Cell>jobposting.position.name</Table.Cell>
                                <Table.Cell>jobposting.city</Table.Cell>
                                <Table.Cell>jobposting.min_salary</Table.Cell>
                                <Table.Cell>jobposting.max_salary</Table.Cell>
                                <Table.Cell>jobposting.num_open_positions</Table.Cell>
                            </Table.Row>
                        ))
                    }
                </Table.Body>
            </Table>
        </div>
    )
}
