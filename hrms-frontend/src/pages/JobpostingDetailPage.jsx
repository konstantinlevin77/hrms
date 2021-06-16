import React, { useState, useEffect } from 'react'
import { useParams } from 'react-router'
import JobPostingService from '../services/JobPostingService';
import { Button, Card, Divider, Icon, Image } from 'semantic-ui-react'

export default function JobpostingDetailPage() {
    const { id } = useParams();

    const [jobposting, setJobposting] = useState({});
    const [isJobseeker, setIsJobseeker] = useState(true)

    const testImage = "https://images.ctfassets.net/2y9b3o528xhq/4uqqgLtDBMPbq9n0I9z6YL/b7d6caeb913564d22ab3c2391961a5bf/nd003_og_image.jpg";
    useEffect(() => {
        let jobPostingService = new JobPostingService();
        jobPostingService.getById(id).then(result => { setJobposting(result.data.data) })
    })

    return (
        <div style={{ display: "flex", justifyContent: "center" }}>
            <Card>
                <Image src={testImage} wrapped ui={false} />
                <Card.Content>
                    <Card.Header>{jobposting.position_name}iOS Developer</Card.Header>
                    <Card.Meta>
                        <span>{/*jobposting.company.companyName*/}Jetget Software Inc.</span>
                    </Card.Meta>
                    <Card.Description>
                        {jobposting.description}We're looking for an iOS developer who can develop iOS
                        apps using Swift and Objective-C.
                </Card.Description>
                    <Divider />
                    <Card.Description>
                        {jobposting.city}Yozgat
                </Card.Description>
                    <Divider />
                    <Card.Description>{jobposting.min_salary}-{jobposting.max_salary}₺</Card.Description>
                </Card.Content>
                <Card.Content extra>
                    <Icon name='user'/>
                    {jobposting.num_open_positions}12 Open Positions
                </Card.Content>
                {isJobseeker ? <Button style={{display:"block",}} primary>Apply!</Button> : null}
            </Card>
        </div>
    )
}
